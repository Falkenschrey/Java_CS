package Chess.Common;

import java.util.Objects;

public class Location {
    private final File file;
    private final int rank;

    public Location(File file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public File getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return file == location.file &&
                Objects.equals(rank, location.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
