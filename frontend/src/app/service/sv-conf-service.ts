import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SvConf} from '../model/SvConf';


const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json'
    })
};

@Injectable({
    providedIn: 'root'
})
export class SvConfService {


    private SV_CONFS = 'http://localhost:8087/api/sv_confs';
    private SV_CONFS_SEARCH = 'http://localhost:8087/api/sv_confs/';
    private SV_CONFS_ADD = 'http://localhost:8087/api/sv_confs';
    private SV_CONFS_UPDATE = 'http://localhost:8087/api/sv_confs';
    private SV_CONF_DELETE = 'http://localhost:8087/api/sv_confs/';


    constructor(private http: HttpClient) {

    }


    findAll(): Observable<SvConf[]>{
        return this.http.get<SvConf[]>(this.SV_CONFS);
    }


    findByName(name: string): Observable<SvConf>{
        return this.http.get<SvConf>(this.SV_CONFS_SEARCH + name);
    }


    add(svConf: SvConf) {
        this.http.post(this.SV_CONFS_ADD, svConf, httpOptions).subscribe();
    }


    update(svConf: SvConf) {
        this.http.put(this.SV_CONFS_UPDATE,  svConf, httpOptions).subscribe();
    }

    delete(name: string) {
        return this.http.delete(this.SV_CONF_DELETE + name, httpOptions).subscribe();
    }

}
