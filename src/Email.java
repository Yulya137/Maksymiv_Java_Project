/*public class Email {
    public static class Builder
    {
        private final String To;
        private String CC;
        private final String Subject ;
        private String Body;
        private Integer Priority;
        private Boolean Attachment = false;

        public Builder(String to, String subject) {
            To = to;
            Subject = subject;
        }
        public Builder withAttach ()
        {
            Attachment = true;
            return this;
        }

        public Email build () {}
    }
}*/


//Task 1. Implement Builder for Email object with fields: to(string), cc(string), subject(string), body(string),
//priority(int), attachment(boolean: true/false). Fields to and subject are mandatory, other are optional.