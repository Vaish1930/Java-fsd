import { Component } from '@angular/core';

@Component({
  selector: 'app-ang-directive',
  templateUrl: './ang-directive.component.html',
  styleUrls: ['./ang-directive.component.css'],
})
export class AngDirectiveComponent {
  marks: number = 78;
  cssclass: string = '';
  res: boolean = false;

  constructor() {
    if (this.marks >= 40) {
      this.cssclass = 'css1';
      this.res = true;
    } else {
      this.cssclass = 'css2';
      this.res = false;
    }
  }
}
