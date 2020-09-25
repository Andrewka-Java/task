import { Component, OnInit } from '@angular/core';
import {SvConf} from '../../model/SvConf';
import {SvConfService} from '../../service/sv-conf-service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-sv-confs',
  templateUrl: './sv-confs.component.html',
  styleUrls: ['./sv-confs.component.css']
})
export class SvConfsComponent implements OnInit {

  svConfs: SvConf[];

  constructor(private svConfService: SvConfService,
              private route: ActivatedRoute) {

  }

  ngOnInit(): void {
    // this.svConfService.findAll().;
  }

}
