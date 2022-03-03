let myPromise = new Promise(function(resolve, reject) {
    // do some sort of operations
    var success = true;
    // TODO: Try to write as a ternary
    // if(success) {
    //     resolve('The process succeeded!');
    // }
    // else {
    //     reject('The process failed :(');
    // }
    (success) ? resolve('The process succeeded!') : reject('The process failed :(');
})

let myPromise2 = new Promise(function(resolve, reject) {
    // do some sort of operations
    var success = false;
    // TODO: Try to write as a ternary
    if(success) {
        resolve('The process succeeded!');
    }
    else {
        
        reject('The process failed :(');
    }
})

function test() {
    console.log('Test');
}

// create our success/failure functions:
successMessage = (message) => console.log('Success: ' + message);
failureMessage = (message) => console.error('Failure: ' + message);

// returns a promise/deal that isn't necessarily instantaneous, 
myPromise.then(successMessage).catch(failureMessage);
myPromise2.then(successMessage).catch(failureMessage);

// non-promises, should be in order
test();
console.log('After promise');