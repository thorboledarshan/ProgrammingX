type Check<T> =
T extends string
?
"Yes"
:
"No";

type A = Check<string>;