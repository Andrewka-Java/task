import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {SvConf} from '../../../model/SvConf';
import {SvConfService} from '../../../service/sv-conf-service';
@Component({
  selector: 'app-add-sv-conf-dialog',
  templateUrl: './add-sv-conf-dialog.component.html',
  styleUrls: ['./add-sv-conf-dialog.component.css']
})
export class AddSvConfDialogComponent implements OnInit {

  @Input()
  display = 'none';

  @Input()
  svConf: SvConf;

  @Output()
  displayAddSvConfModal = new EventEmitter<string>();


  constructor(private service: SvConfService) { }


  ngOnInit(): void {
  }


  add(svConf: SvConf) {
    this.service.add(svConf);
  }


  closeDialog(): void {
    this.display = 'none';
    this.displayAddSvConfModal.emit(this.display);
  }

}
