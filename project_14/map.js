var map1 = new Map();

map1.set("first name", "Robb");
map1.set("last name", "Stark");
map1.set("friend 1", "Bran").set("friend 2", "Arya");
console.log(map1);

console.log("map1 has friend 3 ? " + map1.has("friend 3"));

console.log("get value for key = friend 3-" + map1.get("friend 3"));

map1.clear();

console.log(map1);

class Employee {
  constructor(id, name) {
    this.id = id;
    this.name = name;
  }
  detail() {
    document.writeln(this.id + " " + this.name + "<br>");
  }
}

var employee1 = new Employee(101, "Michael");
var employee2 = new Employee(102, "Bob");

employee1.detail();
employee2.detail();
