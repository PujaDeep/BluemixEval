// index.js

// request message on server
xhrGet("api/hello", function(responseText){
	// add to document
	var mytitle = document.getElementById('message');
	mytitle.innerHTML = responseText;

}, function(err){
	console.log(err);
});

//utilities
function createXHR(){
	if(typeof XMLHttpRequest != 'undefined'){
		return new XMLHttpRequest();
	}else{
		try{
			return new ActiveXObject('Msxml2.XMLHTTP');
		}catch(e){
			try{
				return new ActiveXObject('Microsoft.XMLHTTP');
			}catch(e){}
		}
	}
	return null;
}
function xhrGet(url, callback, errback){
	var xhr = new createXHR();
	xhr.open("GET", url, true);
	xhr.onreadystatechange = function(){
		if(xhr.readyState == 4){
			if(xhr.status == 200){
				callback(xhr.responseText);
			}else{
				errback('service not available');
			}
		}
	};
	xhr.timeout = 3000;
	xhr.ontimeout = errback;
	xhr.send();
}
function parseJson(str){
	return window.JSON ? JSON.parse(str) : eval('(' + str + ')');
}
function prettyJson(str){
	// If browser does not have JSON utilities, just print the raw string value.
	return window.JSON ? JSON.stringify(JSON.parse(str), null, '  ') : str;
}

function displayFields(e){
	
	if (document.getElementById("empadd").checked == true) {
		
		document.getElementById("option").style.display = 'none';
		
		document.getElementById("divempID").style.display = 'block';
		document.getElementById("divemailID").style.display = 'block';
		document.getElementById("searchbtn").style.display = 'none';
		document.getElementById("addbtn").style.display = 'block';
		
		
		
	}
	else if (document.getElementById("empsearch").checked == true)
		{
		document.getElementById("option").style.display = 'block';
		
		document.getElementById("searchbtn").style.display = 'block';
		document.getElementById("addbtn").style.display = 'none';
document.getElementById("divempID").style.display = 'none';
		
		document.getElementById("divemailID").style.display = 'none';
		}
}
	
 


function displaySearchFields(e)
{
	if (document.getElementById("searchID").checked == true) {
		
		document.getElementById("option").style.display = 'block';
		document.getElementById("divempID").style.display = 'block';
		
		document.getElementById("divemailID").style.display = 'none';
		
	}
	else
		{
		document.getElementById("option").style.display = 'block';
		document.getElementById("divemailID").style.display = 'block';
		document.getElementById("divempID").style.display = 'none';
		}
}
