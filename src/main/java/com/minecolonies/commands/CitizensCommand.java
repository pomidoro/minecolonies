package com.minecolonies.commands;

import com.google.common.collect.ImmutableMap;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Minecolonies root command.
 * <p>
 * Manages all sub commands.
 */
public class CitizensCommand extends AbstractSplitCommand
{
    public static final String DESC = "citizens";

    private final ImmutableMap<String, ISubCommand> subCommands =
      new ImmutableMap.Builder<String, ISubCommand>()
        .put(ListCitizensCommand.DESC, new ListCitizensCommand(MinecoloniesCommand.DESC, CitizensCommand.DESC, ListCitizensCommand.DESC))
        .build();

    /**
     * Initialize this command with it's parents.
     *
     * @param parent the String of the parent command.
     */
    public CitizensCommand(@NotNull final String parent)
    {
        super(parent, DESC);
    }

    @Override
    public Map<String, ISubCommand> getSubCommands()
    {
        return subCommands;
    }
}
