import { Component } from '@angular/core';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css'],
})
export class FormsComponent {
  username: string = '';
  password: string = '';
  msg: string = '';

  LoginCheck() {
    if (this.username == 'venugopal' && this.password == '12345')
      this.msg = 'Login Successfull';
    else this.msg = 'Please check username / password';
  }
}
