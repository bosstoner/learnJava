switch(n) {
    case 1: // Start here if n == 1
        // Execute code block #1
        break; // Stop here
    case 2: // Start here if n == 2
        // Execute code block #2
        break; // Stop here
    case 3: // Start here if n == 3
        // Execute code block #3
        break; // Stop here
    default: // If all else fails...
        // Execute code block #4
        break; // Stop here
}


OR


boolean parseYesOrNoResponse(char response) {
    switch(response) {
        case 'y':
        case 'Y': return true;
        case 'n':
        case 'N': return false;
    default:
        throw new IllegalArgumentException("Response must be Y or N");
    }
}


OR

//switch expression
boolean yesOrNo = switch(input) {
 case "y" -> true;
 case "Y" -> true;
 case "N" -> false;
 case "n" -> false;
 default -> throw new IllegalArgumentException("Y or N");
};


SAME AS


boolean yesOrNo = switch(input) {
 case "y", "Y" -> true;
 case "n", "N" -> false;
 default -> throw new IllegalArgumentException("Y or N");
};


boolean yesOrNo = switch(input) {
 case "y", "Y" -> { System.out.println("Got it"); yield true; }
 case "n", "N" -> { System.out.println("Nope"); yield false; }
 default -> throw new IllegalArgumentException("Y or N");
};


switch(input) {
 case "y", "Y" -> System.out.println("Sure");
 case "n", "N" -> System.out.println("Nope");
 default -> throw new IllegalArgumentException("Y or N");
}