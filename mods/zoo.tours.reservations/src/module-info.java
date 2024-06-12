module zoo.tours.reservations {
    exports zoo.tours.reservations;
    // requires the service provider interface package
    requires zoo.tours.api;
    // uses directive since it will be looking up a service
    uses zoo.tours.api.Tour;
}