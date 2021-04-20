import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any[], filterString: any[], propName: string): any[] {
    const resultArray = [];
    if (value.length === 0 || '' || propName === '') {
      return value;
    }

    for (const item of value) {
      if (item[propName] === filterString) {
        resultArray.push(item)
      }
    }
    return resultArray;
  }

}
