import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {SvConf} from '../../../model/SvConf';
import {SvConfService} from '../../../service/sv-conf-service';

@Component({
  selector: 'app-update-sv-conf-dialog',
  templateUrl: './update-sv-conf-dialog.component.html',
  styleUrls: ['./update-sv-conf-dialog.component.css']
})
export class UpdateSvConfDialogComponent implements OnInit {

  @Input()
  display = 'none';

  @Input()
  svConf: SvConf;

  @Output()
  displayUpdateSvConfModal = new EventEmitter<string>();


  constructor(private service: SvConfService) {

  }

  ngOnInit(): void {

  }


  update(svConf: SvConf) {
    console.log(svConf)
    this.service.update(svConf);
  }

  closeDialog(): void {
    this.display = 'none';
    this.displayUpdateSvConfModal.emit(this.display);
  }
}
