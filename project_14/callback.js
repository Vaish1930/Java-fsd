const empId = (function () {
  let count = 0;

  return function () {
    ++count;

    return `emp${count}`;
  };
})();

console.log("New Emplyee IDs are listed here");
console.log("Alex: " + empId(0));
console.log("Dexter: " + empId());
console.log("Annie: " + empId());

//Callbacks

console.log("\n");
function fullName(firstName, lastName, callback) {
  console.log("My name is " + firstName + " " + lastName);
  callback(lastName);
}

var greeting = function (In) {
  console.log("Welcome" + In);

  fullName("Alex", "Wilson", greeting);
  console.log("\n");
  fullName("Dexter", "Johnson", greeting);
  console.log("\n");
  fullName("Annine", "Butler", greeting);
};
