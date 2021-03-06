package ag.axonsbasics.demo.Events;

import jdk.internal.org.jline.utils.Status;

public class AccountActivatedEvent extends BaseEvent<String>{

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
