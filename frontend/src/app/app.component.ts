import {Component, OnInit} from '@angular/core';
import {SvConfService} from './service/sv-conf-service';
import {SvConf} from './model/SvConf';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  svConfs: SvConf[];
  svConf: SvConf;

  displayAddSvConfModal = 'none';
  displayUpdateSvConfModal = 'none';


  constructor(private service: SvConfService) {
  }

  ngOnInit(): void {
    this.findAll();
  }



  findAll() {

    this.service.findAll().subscribe(value => this.svConfs = value);
  }

  findByName(name: string) {
    console.log(name);
    this.service.findByName(name).subscribe(value => {
      this.svConfs.length = 0;
      this.svConfs.push(value);
    });
  }

  delete(name: string) {
    this.service.delete(name);
    this.svConfs = this.svConfs.filter(value => value.name !== name);
  }



  openAddDialog(): void {
    this.displayAddSvConfModal = 'block';
  }

  openUpdateDialog(): void {
    this.displayUpdateSvConfModal = 'block';
  }

  svConfCloseAddDialog($event): void {
    this.displayAddSvConfModal = $event;
  }

  svConfCloseUpdateDialog($event): void {
    this.displayUpdateSvConfModal = $event;
  }


}
