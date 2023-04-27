data class Room(
    val description: String,
    val exits: MutableMap<String, Room> = mutableMapOf()
)

fun main() {
    val bedroom = Room("You are in a bedroom. A window overlooks the castle courtyard.\nA hallway is to the west.")
    val kitchen = Room("You are in the kitchen. It looks like a roast is being made for supper.\nA hallway is to the east.")
    val hallway = Room("You are in a torch-lit hallway.\nThere are rooms to the east and west.")
    val armory = Room("You are in the armory.\nThere is a room off to the south.")
    val castleRoom = Room("You are in a dusty castle room.\nPassages lead to the north and south.")

    armory.exits["s"] = castleRoom
    bedroom.exits["w"] = hallway
    kitchen.exits["e"] = hallway
    hallway.exits["e"] = bedroom
    hallway.exits["w"] = kitchen
    castleRoom.exits["n"] = armory
    castleRoom.exits["s"] = hallway

    var currentRoom = castleRoom

    while (true) {
        println(currentRoom.description)
        print("What direction? ")
        val direction = readLine()

        if (direction != null && currentRoom.exits.containsKey(direction)) {
            currentRoom = currentRoom.exits[direction]!!
        } else {
            println("Can't go that way.")
        }
    }
}
