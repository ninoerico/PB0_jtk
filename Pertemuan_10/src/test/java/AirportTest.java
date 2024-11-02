//public class AirportTest {
//    @DisplayName("Given there is an economy flight")
//    @Nested
//    class EconomyFlightTest {
//        private Flight economyFlight;
//        @BeforeEach// akan di jalankan sebelum ny
//        void setUp() {
//            economyFlight = new Flight("1", "Economy");// mengecek apakah kode penerbangan ny 1
//        }
//        @Test// fungsion untuk test sesuai dengan skenario yang di inginkan dan akan mengecek
//        public void testEconomyFlightRegularPassenger() {
//            Passenger mike = new Passenger("Mike", false);// cek apakah ada terdapat  orang bernama mike
//            assertEquals("1", economyFlight.getId());
//            assertEquals(true, economyFlight.addPassenger(mike));
//            assertEquals(1, economyFlight.getPassengersList().size()); //size digunakan untuk melakukan cek berapa jumlah dari economy flight
//            assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());
//            assertEquals(true, economyFlight.removePassenger(mike));
//            assertEquals(0, economyFlight.getPassengersList().size());
//        }
//        @Test
//        public void testEconomyFlightVipPassenger() {
//            Passenger james = new Passenger("James", true);
//            assertEquals("1", economyFlight.getId());
//            assertEquals(true, economyFlight.addPassenger(james));
//            assertEquals(1, economyFlight.getPassengersList().size());
//            assertEquals("James",
//                    economyFlight.getPassengersList().get(0).getName());
//            assertEquals(false, economyFlight.removePassenger(james));
//            assertEquals(1, economyFlight.getPassengersList().size());
//        }
//    }
//}
//// unit test sangat penting dalam dunia perangkat lunak unit testing bisa di pakai menggunakan apa saja
////case sangat bergantung pada hasilnya unit test

//public class AirportTest {
//[...]
//    @DisplayName("Given there is a business flight")
//    @Nested
//    class BusinessFlightTest {
//        private Flight businessFlight;
//        @BeforeEach
//        void setUp() {
//            businessFlight = new Flight("2", "Business");
//        }
//        @Test
//        public void testBusinessFlightRegularPassenger() {
//            Passenger mike = new Passenger("Mike", false);
//            assertEquals(false, businessFlight.addPassenger(mike));
//            assertEquals(0, businessFlight.getPassengersList().size());
//            assertEquals(false, businessFlight.removePassenger(mike));
//            assertEquals(0, businessFlight.getPassengersList().size());
//        }
//        @Test
//        public void testBusinessFlightVipPassenger() {
//            Passenger james = new Passenger("James", true);
//            assertEquals(true, businessFlight.addPassenger(james));
//            assertEquals(1, businessFlight.getPassengersList().size());
//            assertEquals(false, businessFlight.removePassenger(james));
//            assertEquals(1, businessFlight.getPassengersList().size());
//        }
//    }
//}
//
//public class AirportTest {
//    @DisplayName("Given there is an economy flight")
//    @Nested
//    class EconomyFlightTest {
//        private Flight economyFlight;
//        @BeforeEach
//        void setUp() {
//            economyFlight = new EconomyFlight("1");
//        }
//[...]
//    }
//    @DisplayName("Given there is a business flight")
//    @Nested
//    class BusinessFlightTest {
//        private Flight businessFlight;
//        @BeforeEach
//        void setUp() {
//            businessFlight = new BusinessFlight("2");
//        }
//[...]
//    }
//}

public class AirportTest {
    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;
        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
        }
[...]
    }
    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
        }
[...]
    }
}