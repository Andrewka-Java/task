import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SvConfComponent } from './sv-conf.component';

describe('SvConfComponent', () => {
  let component: SvConfComponent;
  let fixture: ComponentFixture<SvConfComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SvConfComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SvConfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
