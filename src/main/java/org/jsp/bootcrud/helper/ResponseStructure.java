package org.jsp.bootcrud.helper;

public class ResponseStructure<T> {
 private String message;
 private int status;
 T data;
public final String getMessage() {
	return message;
}
public final void setMessage(String message) {
	this.message = message;
}
public final int getStatus() {
	return status;
}
public final void setStatus(int status) {
	this.status = status;
}
public final T getData() {
	return data;
}
public final void setData(T data) {
	this.data = data;
}
@Override
public String toString() {
	return "ResponseSrucure [message=" + message + ", status=" + status + ", data=" + data + "]";
}
 
}
