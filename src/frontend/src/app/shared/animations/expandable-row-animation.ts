import {
  animate,
  state,
  style,
  transition,
  trigger,
} from '@angular/animations';

export const expandableRowAnimation = trigger('detailExpand', [
  state('collapsed', style({
    height: '0px',
    visibility: 'hidden'
  })),
  state('expanded', style({
    height: '*',
    visibility: 'visible'
  })),
  transition('expanded <=> collapsed', animate('225ms cubic-bezier(0.4, 0.0, 0.2, 1)')),
]);
