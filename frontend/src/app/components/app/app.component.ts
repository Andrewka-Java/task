import {Component, OnInit} from '@angular/core';
import {SvConfService} from '../../service/sv-conf-service';
import {SvConf} from '../../model/SvConf';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  svConfs: SvConf[];

  constructor(private service: SvConfService) {
  }

  ngOnInit(): void {
    this.findAll();
  }


  findAll() {
    this.service.findAll().subscribe(value => this.svConfs = value);
  }

  add(svConf:  SvConf) {
    this.service.add(svConf);
  }

  delete(name: string) {
    this.service.delete(name);
  }

}
