package com.bluechilli.flutteruploader;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public class UploadTask {

  private String _url;
  private String _method;
  private Map<String, String> _headers;
  private Map<String, Object> _data;
  private List<FileItem> _files;
  private int _requestTimeoutInSeconds;
  private boolean _showNotification;
  private boolean _binaryUpload;
  private String _tag;
  private int _id;
  private boolean _isAPIRequest;
  private String _jwtToken;

  public UploadTask(
      int id,
      String url,
      String method,
      List<FileItem> files,
      Map<String, String> headers,
      Map<String, Object> data,
      int requestTimeoutInSeconds,
      boolean showNotification,
      boolean binaryUpload,
      String tag,boolean isAPIRequest,String jwtToken) {
    _id = id;
    _url = url;
    _method = method;
    _files = files;
    _headers = headers;
    _data = data;
    _requestTimeoutInSeconds = requestTimeoutInSeconds;
    _showNotification = showNotification;
    _binaryUpload = binaryUpload;
    _tag = tag;
    _isAPIRequest=isAPIRequest;
    _jwtToken =jwtToken;
  }

  public String getURL() {
    return _url;
  }

  public Uri getUri() {
    return Uri.parse(_url);
  }

  public String getMethod() {
    return _method;
  }

  public List<FileItem> getFiles() {
    return _files;
  }

  public Map<String, String> getHeaders() {
    return _headers;
  }

  public Map<String, Object> getParameters() {
    return _data;
  }

  public int getTimeout() {
    return _requestTimeoutInSeconds;
  }

  public boolean canShowNotification() {
    return _showNotification;
  }

  public boolean isBinaryUpload() {
    return _binaryUpload;
  }

  public String getTag() {
    return _tag;
  }

  public int getId() {
    return _id;
  }

  public boolean isAPIRequest() {
    return _isAPIRequest;
  }

  public void setIsAPIRequest(boolean _isAPIRequest) {
    this._isAPIRequest = _isAPIRequest;
  }

  public String getJwtToken() {
    return _jwtToken;
  }

  public void setJwtToken(String jwtToken) {
    this._jwtToken = jwtToken;
  }
}
