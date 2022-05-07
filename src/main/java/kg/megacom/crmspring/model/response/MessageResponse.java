package kg.megacom.crmspring.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MessageResponse {

    private String message;

    public static MessageResponse sendMessage(String message) {
        return new MessageResponse(message);
    }
}
