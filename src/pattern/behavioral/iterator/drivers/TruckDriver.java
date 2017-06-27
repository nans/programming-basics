package pattern.behavioral.iterator.drivers;

public class TruckDriver implements Collection {
    private String name;
    private String[] licenses;

    public TruckDriver(String name, String[] licenses) {
        this.name = name;
        this.licenses = licenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLicenses() {
        return licenses;
    }

    public void setLicenses(String[] licenses) {
        this.licenses = licenses;
    }

    @Override
    public Iterator getIterator() {
        return new LicenseIterator();
    }

    private class LicenseIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < licenses.length;
        }

        @Override
        public Object next() {
            return licenses[index++];
        }
    }
}
