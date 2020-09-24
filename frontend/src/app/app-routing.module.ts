import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {SvConfsComponent} from './components/sv-confs/sv-confs.component';
import {SvConfComponent} from './components/sv-conf/sv-conf.component';



const routes: Routes = [
  {path: '', component: SvConfsComponent},
  {path: 'sv_conf', component: SvConfComponent},
  {path: 'sv_confs', component: SvConfsComponent}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
