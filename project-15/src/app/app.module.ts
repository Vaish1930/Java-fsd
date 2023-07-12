import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { FormsModule } from '@angular/forms';
import { FormsComponent } from './forms/forms.component';
import { AngDirectiveComponent } from './ang-directive/ang-directive.component';

@NgModule({
  declarations: [AppComponent, ProductsComponent, FormsComponent, AngDirectiveComponent],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
