import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddSvConfComponent } from './add-sv-conf.component';

describe('AddSvConfComponent', () => {
  let component: AddSvConfComponent;
  let fixture: ComponentFixture<AddSvConfComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddSvConfComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddSvConfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
