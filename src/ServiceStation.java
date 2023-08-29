public class ServiceStation implements Service {

    @Override
    public void checkTransport(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            transport.check();
        }
    }
}