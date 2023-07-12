import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AngDirectiveComponent } from './ang-directive.component';

describe('AngDirectiveComponent', () => {
  let component: AngDirectiveComponent;
  let fixture: ComponentFixture<AngDirectiveComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AngDirectiveComponent]
    });
    fixture = TestBed.createComponent(AngDirectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
