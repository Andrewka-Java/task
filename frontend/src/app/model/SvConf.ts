export class SvConf {

    private _name: string;
    private _value: string;
    private _desc: string;


    constructor(name: string, value: string, desc: string) {
        this._name = name;
        this._value = value;
        this._desc = desc;
    }


    get name(): string {
        return this._name;
    }

    set name(value: string) {
        this._name = value;
    }

    get value(): string {
        return this._value;
    }

    set value(value: string) {
        this._value = value;
    }

    get desc(): string {
        return this._desc;
    }

    set desc(value: string) {
        this._desc = value;
    }
}
