import java.io.File;

public class ObjectMapper {

        private UtilClass person;


        public void addFile(UtilClass person){
                ObjectMapper objectMapper = new ObjectMapper();
                UtilClass person1 = new UtilClass("yellow", 2);
                objectMapper.writeValue(new File("person.json"), person1);

        }

        private void writeValue(File file, UtilClass person1) {
                
        }

        public void readFile(UtilClass person){
                ObjectMapper objectMapper = new ObjectMapper();
                UtilClass person1 = new UtilClass("yellow", 2);
                objectMapper.readValue(new File("person.json"), person1);

        }

        private void readValue(File file, UtilClass person1) {
        }

}
