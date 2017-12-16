//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.12.16 um 06:26:06 PM CET 
//


package main.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * main.generated in the main.generated package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Conn_QNAME = new QName("", "conn");
    private final static QName _StationDetails_QNAME = new QName("", "station-details");
    private final static QName _Stations_QNAME = new QName("", "stations");
    private final static QName _M_QNAME = new QName("", "m");
    private final static QName _Timetable_QNAME = new QName("", "timetable");
    private final static QName _S_QNAME = new QName("", "s");
    private final static QName _Trip_QNAME = new QName("", "trip");
    private final static QName _Trips_QNAME = new QName("", "trips");
    private final static QName _Timetables_QNAME = new QName("", "timetables");
    private final static QName _Station_QNAME = new QName("", "station");
    private final static QName _Tl_QNAME = new QName("", "tl");
    private final static QName _Details_QNAME = new QName("", "details");
    private final static QName _Event_QNAME = new QName("", "event");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Connection }
     * 
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link StationDetails }
     * 
     */
    public StationDetails createStationDetails() {
        return new StationDetails();
    }

    /**
     * Create an instance of {@link MultipleStationData }
     * 
     */
    public MultipleStationData createMultipleStationData() {
        return new MultipleStationData();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Timetable }
     * 
     */
    public Timetable createTimetable() {
        return new Timetable();
    }

    /**
     * Create an instance of {@link TimetableStop }
     * 
     */
    public TimetableStop createTimetableStop() {
        return new TimetableStop();
    }

    /**
     * Create an instance of {@link Trip }
     * 
     */
    public Trip createTrip() {
        return new Trip();
    }

    /**
     * Create an instance of {@link MultipleTrips }
     * 
     */
    public MultipleTrips createMultipleTrips() {
        return new MultipleTrips();
    }

    /**
     * Create an instance of {@link MultipleTimetables }
     * 
     */
    public MultipleTimetables createMultipleTimetables() {
        return new MultipleTimetables();
    }

    /**
     * Create an instance of {@link StationData }
     * 
     */
    public StationData createStationData() {
        return new StationData();
    }

    /**
     * Create an instance of {@link TripLabel }
     * 
     */
    public TripLabel createTripLabel() {
        return new TripLabel();
    }

    /**
     * Create an instance of {@link StopDetails }
     * 
     */
    public StopDetails createStopDetails() {
        return new StopDetails();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link ReferenceTripLabel }
     * 
     */
    public ReferenceTripLabel createReferenceTripLabel() {
        return new ReferenceTripLabel();
    }

    /**
     * Create an instance of {@link HistoricPlatformChange }
     * 
     */
    public HistoricPlatformChange createHistoricPlatformChange() {
        return new HistoricPlatformChange();
    }

    /**
     * Create an instance of {@link TripStop }
     * 
     */
    public TripStop createTripStop() {
        return new TripStop();
    }

    /**
     * Create an instance of {@link ReferenceTripStopLabel }
     * 
     */
    public ReferenceTripStopLabel createReferenceTripStopLabel() {
        return new ReferenceTripStopLabel();
    }

    /**
     * Create an instance of {@link TripReference }
     * 
     */
    public TripReference createTripReference() {
        return new TripReference();
    }

    /**
     * Create an instance of {@link HistoricChange }
     * 
     */
    public HistoricChange createHistoricChange() {
        return new HistoricChange();
    }

    /**
     * Create an instance of {@link DistributorMessage }
     * 
     */
    public DistributorMessage createDistributorMessage() {
        return new DistributorMessage();
    }

    /**
     * Create an instance of {@link JaxbEntity }
     * 
     */
    public JaxbEntity createJaxbEntity() {
        return new JaxbEntity();
    }

    /**
     * Create an instance of {@link ReferenceTripRelation }
     * 
     */
    public ReferenceTripRelation createReferenceTripRelation() {
        return new ReferenceTripRelation();
    }

    /**
     * Create an instance of {@link ReferenceTrip }
     * 
     */
    public ReferenceTrip createReferenceTrip() {
        return new ReferenceTrip();
    }

    /**
     * Create an instance of {@link HistoricDelay }
     * 
     */
    public HistoricDelay createHistoricDelay() {
        return new HistoricDelay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "conn")
    public JAXBElement<Connection> createConn(Connection value) {
        return new JAXBElement<Connection>(_Conn_QNAME, Connection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "station-details")
    public JAXBElement<StationDetails> createStationDetails(StationDetails value) {
        return new JAXBElement<StationDetails>(_StationDetails_QNAME, StationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleStationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stations")
    public JAXBElement<MultipleStationData> createStations(MultipleStationData value) {
        return new JAXBElement<MultipleStationData>(_Stations_QNAME, MultipleStationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "m")
    public JAXBElement<Message> createM(Message value) {
        return new JAXBElement<Message>(_M_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Timetable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timetable")
    public JAXBElement<Timetable> createTimetable(Timetable value) {
        return new JAXBElement<Timetable>(_Timetable_QNAME, Timetable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimetableStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "s")
    public JAXBElement<TimetableStop> createS(TimetableStop value) {
        return new JAXBElement<TimetableStop>(_S_QNAME, TimetableStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "trip")
    public JAXBElement<Trip> createTrip(Trip value) {
        return new JAXBElement<Trip>(_Trip_QNAME, Trip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTrips }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "trips")
    public JAXBElement<MultipleTrips> createTrips(MultipleTrips value) {
        return new JAXBElement<MultipleTrips>(_Trips_QNAME, MultipleTrips.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTimetables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timetables")
    public JAXBElement<MultipleTimetables> createTimetables(MultipleTimetables value) {
        return new JAXBElement<MultipleTimetables>(_Timetables_QNAME, MultipleTimetables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "station")
    public JAXBElement<StationData> createStation(StationData value) {
        return new JAXBElement<StationData>(_Station_QNAME, StationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripLabel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tl")
    public JAXBElement<TripLabel> createTl(TripLabel value) {
        return new JAXBElement<TripLabel>(_Tl_QNAME, TripLabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "details")
    public JAXBElement<StopDetails> createDetails(StopDetails value) {
        return new JAXBElement<StopDetails>(_Details_QNAME, StopDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "event")
    public JAXBElement<Event> createEvent(Event value) {
        return new JAXBElement<Event>(_Event_QNAME, Event.class, null, value);
    }

}
