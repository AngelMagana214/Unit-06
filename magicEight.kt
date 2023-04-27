import kotlin.random.Random

fun main() {
    val responses = arrayOf(
        "Hell yeah boyyy!",
        "Without a doubt, yes.",
        "You can count on it.",
        "Fo'sho homie!",
        "Ask me later.",
        "I’m not sure.",
        "I don't know right now, ask me when I feel like it!",
        "I don’t think so.",
        "Without a doubt, no.",
        "Hell no fool!"
    )

    while (true) {
        print("Ask a question or type 'quit' to exit: ")
        val question = readLine() ?: ""

        if (question.lowercase() == "quit") {
            break
        }

        val randomResponse = responses[Random.nextInt(responses.size)]
        println("Magic 8 Ball says: $randomResponse\n")
    }
}
