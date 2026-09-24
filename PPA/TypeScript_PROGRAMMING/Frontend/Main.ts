import PromptSync from "prompt-sync";

const accept = PromptSync();

let name = accept("Enter name : ");

console.log("Welcome", name);