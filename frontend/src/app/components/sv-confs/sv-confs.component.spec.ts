import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SvConfsComponent } from './sv-confs.component';

describe('SvConfsComponent', () => {
  let component: SvConfsComponent;
  let fixture: ComponentFixture<SvConfsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SvConfsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SvConfsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
