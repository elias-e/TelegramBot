package TelegramBot;

public class Bot {

	public static void main(String[] args) {
		import org.telegram.telegrambots.api.methods.send.SendMessage;
		import org.telegram.telegrambots.api.objects.Update;
		import org.telegram.telegrambots.bots.TelegramLongPollingBot;
		import org.telegram.telegrambots.exceptions.TelegramApiException;

		public class MyAmazingBot extends TelegramLongPollingBot {
		    @Override
		    public void onUpdateReceived(Update update) {
		        // TODO
		    }

		    @Override
		    public String getBotUsername() {
		        // TODO
		        return null;
		    }

		    @Override
		    public String getBotToken() {
		        // TODO
		        return null;
		    }
		}

	}

}
