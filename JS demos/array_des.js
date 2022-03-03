let a, b, rest;

[a,b] = [10,20];

// console.log(a);
// console.log(b);

[a, b, ...rest] = [10,20,30,40,50];

console.log(a);
console.log(b);
console.log(rest)

var chicken = {
    'name': 'Chicken Little',
    'height' : '2'
}

var newChicken = {
    ...chicken, 
    'friends': ['pig', 'duck', 'fish'],
    'catchphrase': 'The sky is falling!'
}

console.log(newChicken);