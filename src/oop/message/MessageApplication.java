package oop.message;

public class MessageApplication {
    public static void main(String[] args) {
        DictionaryMessage dictionaryMessage = new DictionaryMessage();
        DictionaryMessage customMessages = new DictionaryMessage(new String[]{"Ala", "ma", "kota"});
        RandomMessage smallRandomMessage = new RandomMessage(10,0);
        RandomMessage bigRandomMessage = new RandomMessage(1000, -1000);

        Message[] messages = {dictionaryMessage,smallRandomMessage,customMessages,bigRandomMessage};

        printMessages(messages);
    }

    public static void printMessages(Message[] messages) {
        for (int i = 0; i < messages.length; i++) {
            System.out.println("Message [" + i + "] = " + messages[i].getMessage());
        }
    }
}
