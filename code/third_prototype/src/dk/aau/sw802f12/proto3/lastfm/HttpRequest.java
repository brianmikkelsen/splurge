package dk.aau.sw802f12.proto3.lastfm;

import org.w3c.dom.Document;
import java.net.URLEncoder;

import android.util.Log;
/**
 * Wrapper class.
 * Initiates http request, and passes result on to responseHandler;
 */
class HttpRequest {
	
	private String mRequest;
	private XmlResponseHandler mHandler;
	
	public HttpRequest(String uri, XmlResponseHandler xmlResponseHandler) {
		mRequest = URLEncoder.encode(uri);
		mHandler = xmlResponseHandler;
		HttpClient hc = HttpClient.getInstance();
		hc.request(this);
	}
	
	public String getRequest(){
		return mRequest;
	}
	
	public void setResponse(Document xmlDocument) {
		mHandler.execute(xmlDocument);
	}
}
