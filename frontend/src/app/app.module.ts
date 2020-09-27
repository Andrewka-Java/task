import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AddSvConfDialogComponent } from './components/dialogs/add-sv-conf-dialog/add-sv-conf-dialog.component';
import {AppRoutingModule} from './app-routing.module';
import { UpdateSvConfDialogComponent } from './components/dialogs/update-sv-conf-dialog/update-sv-conf-dialog.component';

@NgModule({
  declarations: [
    AppComponent,
    AddSvConfDialogComponent,
    UpdateSvConfDialogComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
