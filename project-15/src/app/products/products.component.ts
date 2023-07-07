import { Component } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css'],
})
export class ProductsComponent {
  fname: string = 'Vaishnavi';
  myClass = 'success';
  color = 'red';

  updateColor() {
    this.color = 'blue';
  }

  demofunc() {
    this.fname = 'Alex';
  }

  newName: string = 'Claire';
}
