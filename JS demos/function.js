function printLower(message) {
    console.log(message.toLowerCase());
}

function printUpper(message) {
    console.log(message.toUpperCase());
}

function print(message, func) {
    func(message);
}

print('lOWercASe', printLower);
print('UppErCaSE', printUpper);
