// waiting 2 seconds:
function wait2Seconds() {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve('resolved');
        }, 2000)
    });
}

async function asyncCall() {
    console.log('calling');
    const result = await wait2Seconds();
    console.log(result);
}

asyncCall();