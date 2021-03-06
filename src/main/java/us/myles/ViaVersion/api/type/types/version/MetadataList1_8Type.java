package us.myles.ViaVersion.api.type.types.version;

import io.netty.buffer.ByteBuf;
import us.myles.ViaVersion.api.minecraft.metadata.Metadata;
import us.myles.ViaVersion.api.type.types.minecraft.MetaListTypeTemplate;

import java.util.ArrayList;
import java.util.List;

public class MetadataList1_8Type extends MetaListTypeTemplate {

    @Override
    public List<Metadata> read(ByteBuf buffer) throws Exception {
        List<Metadata> list = new ArrayList<>();
        Metadata m;
        do {
            m = Types1_8.METADATA.read(buffer);
            if (m != null) {
                list.add(m);
            }
        } while (m != null);

        return list;
    }

    @Override
    public void write(ByteBuf buffer, List<Metadata> object) throws Exception {
        throw new UnsupportedOperationException("1.8 MetadataList writing is not implemented");
    }
}
