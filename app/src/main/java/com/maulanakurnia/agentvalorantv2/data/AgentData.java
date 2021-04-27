package com.maulanakurnia.agentvalorantv2.data;

import com.maulanakurnia.agentvalorantv2.model.AgentModel;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public final class AgentData {

    @NotNull
    public static ArrayList<AgentModel> generateAgent() {
        ArrayList<AgentModel> agent = new ArrayList<>();

        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/3/37/Brimstone_artwork.png/revision/latest/scale-to-width-down/326?cb=20200602020239",
            "Brimstone",
            "Controller",
            "Brimstone’s orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and safely make him the unmatched boots-on-the-ground commander. \n\nBrimstone is a powerful commander that utilizes incendiary grenades, smokescreen airstrikes, and rapid-fire-inducing stim beacons to damage enemies and buff teammates. His impressive Orbital Strike ultimate summons an enormous laser that destroys anyone who doesn't move out of the radius fast enough."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/6/61/Sova_artwork.png",
            "Sova",
            "Initiator",
            "Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide. \n\nAn archery expert, he can equip his bow with different bolts that reveal enemy locations or shock nearby adversaries. He can also deploy a recon drone to survey the battlefield, while his ultimate lets him fire three deadly arrow shots through walls. \n\nOriginally, Sova was supposed to be a female and was supposed to have a visor."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/1/1e/Sage_artwork.png/revision/latest?cb=20200602020306",
            "Sage",
            "Sentinel",
            "Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off forceful assaults, she provides a calm center to a hellish battlefield. \n\nThe most prominent support character to date hails from China and brings orbs that heal allies, slow enemies, and create barriers out of the ground to impede the flow of a match. Her ultimate ability allows her to resurrect a fallen ally,which is significant in a game with no respawns"
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/4/41/Reyna_artwork.png/revision/latest?cb=20200602020340",
            "Reyna",
            "Duelist",
            "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance. \n\nReyna has the passive ability of Soul Harvest, enemies killed by Reyna or her teammates leave behind Soul Orbs that lasts 3 seconds. Soul Harvest abilities consist of Devour and Dismiss which have a shared usage pool."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/b/b9/Skye_Keyart_final.png/revision/latest?cb=20201013182515",
            "Skye",
            "Initiator",
            "Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye's side."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/b/bb/Cypher_artwork.png/revision/latest?cb=20200602020329",
            "Cypher",
            "Sentinel",
            "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy’s every move. No secret is safe. No maneuver goes unseen. Cypher is always watching. \n\nIf intel is your thing, Cypher might be your Agent. This Moroccan surveillance Agent has abilities that trap and reveal the locations of enemies that get stuck in them, as well as an actual spycam he can place on the map to watch the action from afar. His ultimate extracts information from a fresh enemy corpse to temporarily reveal the location of remaining players on the opposing team."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/8/8c/Killjoy.png/revision/latest?cb=20200729134445",
            "KillJoy",
            "Sentinel",
            "The genius of Germany, Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots debuff will help make short work of them."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/7/79/Jett_artwork.png/revision/latest?cb=20200602020209",
            "Jett",
            "Duelist",
            "From Korea comes Jett, an agile fighter who prioritizes movement over everything. Her abilities include a teleportation-based dash and an updraft that lets her reach higher ledges. She also has a smokebomb ability to hinder sightlines and a powerful Bladestorm ultimate that deals moderate-to-heavy damage and remains accurate even while she's moving. \n\nJett is one of the few Agents with a passive ability. Holding the jump key while in the air will allow Jett to slow her descent. \n\nJett's Ultimate allows her to wield several throwing knives that deal moderate damage and kill on headshots. Getting a kill replenishes your daggers and you can choose to throw them one at a time or throw all remaining daggers in a short-ranged burst."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/5/5c/Breach_artwork.png/revision/latest?cb=20200602020225",
            "Breach",
            "Initiator",
            "Breach fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair. \n\nBreach's main gimmick is the ability to use all of his abilities through the geometry of the map,whether it is through walls, roofs, or terrain. This ability set rewards experienced players for knowing the maps well. His abilities also seem to reward an aggressive playstyle despite most of his abilities being crowd-control based."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/c/c4/Raze_artwork.png/revision/latest?cb=20200602020217",
            "Raze",
            "Duelist",
            "Raze loves explosives. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of \"boom\" \n\nRaze's playstyle is very aggressive compared to many of the other agents in VALORANT, as most of her abilities are focused on mobility and damage instead of intel gathering or support. She is one of the few agents where most of her abilities are primarily meant to deal damage, namely Paint Shells and Showstopper, and has commonly been criticized by the community for said abilities."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/9/91/Viper_artwork.png/revision/latest?cb=20200602020322",
            "Viper",
            "Controller",
            "Viper deploys an array of poisonous chemical devices to control the battlefield and cripple the enemy’s vision. If the toxins don’t kill her prey, her mind games surely will. \n\nA predator that deals in poison and chemical warfare. She has exploding projectiles that spill acid on the battlefield, as well as a poison-gas emitter, and a toxic gas screen to prevent passage. Her ultimate emits a toxic cloud that conceals her location and can highlight enemies who wander into it."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/0/06/Omen_artwork.png/revision/latest?cb=20200602020233",
            "Omen",
            "Controller",
            "Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next. \n\nA man with mysterious origins, Omen is focused on hindering the vision of his enemies with things like an orb that strikes those in his sights with nearsightedness and another that bursts to obscure the vision of everyone nearby. He can also teleport a short distance, or use his ultimate to teleport anywhere on the map as a shadow."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/a/a1/Yoru2.png/revision/latest?cb=20210112180407",
            "Yoru",
            "Duelist",
            "Japanese native Yoru rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look."
        ));
        agent.add(new AgentModel(
            "https://static.wikia.nocookie.net/valorant/images/8/8a/Astra_artwork.png/revision/latest?cb=20210302170140",
            "Astra",
            "Controller",
            "Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she’s always eons ahead of her enemy’s next move."
        ));

        return agent;
    }
}
