import { Component } from '@angular/core';
import {SvConfService} from './service/sv-conf-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';


  constructor(private service: SvConfService) {
    this.service.findAll();
  }

}
