function Employee(name, designation, yearOfBirth) {
  this.name = name;
  this.designation = designation;
  this.yearOfBirth = yearOfBirth;
}

Employee.prototype.calculateAge = function () {
  console.log("The age is " + (2023 - this.yearOfBirth));
};
console.log(Employee.prototype);

let employee = new Employee("Alex", "Software Engineer", 1999);
employee.calculateAge();
let employee1 = new Employee("Alex12", "Tester", 2001);
employee1.calculateAge();
let employee2 = new Employee("Luke", "Senior ", 1989);
employee2.calculateAge();
