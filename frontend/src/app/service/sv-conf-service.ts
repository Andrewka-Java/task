import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Client, ISoapMethodResponse, NgxSoapService, WSDL} from 'ngx-soap';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'text/xml', 'Access-Control-Allow-Origin': '*'
  })
};

const body = {};

@Injectable({
  providedIn: 'root'
})
export class SvConfService {

  private URI = 'http://localhost:8088/ws/cv_conf';
  private client: Client;
  private wsdl: WSDL;
  private message;


  constructor(private http: HttpClient,
              private soap: NgxSoapService) {

  }




  findAll(){
      var data = "<?xml version='1.0' encoding='UTF-8'?>\n<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n                  xmlns:sv=\"http://epolsoft.com/sv_conf\">\n\n    <soapenv:Header/>\n    <soapenv:Body>\n        <sv:getAllSvConfRequest>\n        </sv:getAllSvConfRequest>\n    </soapenv:Body>\n\n</soapenv:Envelope>\n";

      var xhr = new XMLHttpRequest();
      xhr.withCredentials = true;

      xhr.addEventListener("readystatechange", function () {
          if (this.readyState === 4) {
              console.log(this.responseText);
          }
      });

      xhr.open("POST", "http://localhost:8088/ws/cv_conf");
      xhr.setRequestHeader("Content-Type", "text/xml");
      xhr.setRequestHeader("cache-control", "no-cache");
      xhr.setRequestHeader("Postman-Token", "31f2911e-e71b-41a3-b9eb-a13b6e861c32");

      xhr.send(data);
  }


}
