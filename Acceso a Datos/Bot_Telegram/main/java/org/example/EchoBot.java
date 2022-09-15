package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class EchoBot extends TelegramLongPollingBot {

    public String getBotUsername() {
        return "AulaNosa_bot";
    }

    public String getBotToken() {
        return "5602846961:AAGRg6ljHFWeTJXH7emBzKT_b4AQVREaFh0";
    }

    public void onUpdateReceived(final Update update) {
        final String messageTextReceived = update.getMessage().getText();

        final long chatId = update.getMessage().getChatId();

        SendMessage message = procesarMensaje(String.valueOf(chatId), messageTextReceived);

        try{
            execute(message);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    private SendMessage procesarMensaje(String chatId, String texto){
        SendMessage message = new SendMessage();
        message.setText(texto + " tu padre");
        message.setChatId(String.valueOf(chatId));

        return message;
    }
}
