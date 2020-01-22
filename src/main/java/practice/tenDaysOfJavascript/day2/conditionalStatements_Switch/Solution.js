'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function getLetter(s) {
    let letter;

    switch (true) {
        case /^[aeiou]/.test(s):
            letter = "A";
            break;
        case /^[bcdfg]/.test(s):
            letter = "B";
            break;
        case /^[hjklm]/.test(s):
            letter = "C";
            break;
        case /^[npqrstvwxyz]/.test(s):
            letter = "D";
            break;
    }

    return letter;
}


function main() {
    const s = readLine();

    console.log(getLetter(s));
}